package mk11.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class DataMap<K, V> extends HashMap<K, V> {

	private Log log = LogFactory.getLog(this.getClass());

	private static final long serialVersionUID = 1682164252025902792L;

	private final int arrSize = 30;

	/**
	 * 
	 * <pre>
	 * 내부 Key 와 Value 을 String 으로 return 한다.
	 * </pre>
	 * 
	 * @return String
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String toStringAll() {

		Vector vt = new Vector(keySet());
		Collections.sort(vt);

		String[] value = null;

		// Iterator<?> iter = keySet().iterator();
		Iterator<?> iter = vt.iterator();
		StringBuffer sb = new StringBuffer();

		sb.append("\n[\n\n  ");

		while (iter.hasNext()) {
			String key = (String) iter.next();
			if (get(key) instanceof String[]) {// String[]
				value = (String[]) (get(key));// output은 String or String[]
				for (int validx = 0; validx < value.length; validx++) {
					sb.append(key + "[" + validx + "]" + " : "
							+ String.valueOf(value[validx]) + " \n  ");
				}
			} else {
				sb.append(key + " : " + String.valueOf(get(key)) + " \n  ");
			}
		}
		return sb.append("\n]").toString();
	}

	/**
	 * 
	 * <pre>
	 * 내부 Key 값을 String 으로 return 한다
	 * </pre>
	 * 
	 * @return String
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String toStringKey() {
		Vector vt = new Vector(keySet());
		Collections.sort(vt);

		Iterator<?> iter = vt.iterator();
		StringBuffer sb = new StringBuffer();
		sb.append("\n[\n ");

		while (iter.hasNext()) {
			String key = (String) iter.next();
			sb.append(key + " \n ");

		}
		return sb.append("]").toString();
	}

	/**
	 * key값을 소문자로 변경해서 입력함.
	 * 
	 * @param m
	 *            mappings to be stored in this map
	 */
	@SuppressWarnings("unchecked")
	public void putlowerCaseKeyAll(Map<? extends K, ? extends V> m) {
		for (Map.Entry<? extends K, ? extends V> e : m.entrySet()) {
			if (e.getKey() instanceof String && e.getValue() != null) {
				put((K) StringUtils.lowerCase(e.getKey().toString()),
						e.getValue());
			} else {
				put(e.getKey(), e.getValue());
			}

		}

	}

	/**
	 * 
	 * <pre>
	 * 내부 key 를 소문자로 변경한다.
	 * </pre>
	 * 
	 * void
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void toLowerKeyAll() {

		Iterator<?> iter = keySet().iterator();
		String key = "";
		String lowKey = "";
		HashMap tmpHm = new HashMap();
		while (iter.hasNext()) {
			key = (String) iter.next();
			lowKey = StringUtils.lowerCase(key);
			tmpHm.put(lowKey, get(key));

		}

		clear();

		Iterator<?> tmpIter = tmpHm.keySet().iterator();
		while (tmpIter.hasNext()) {
			key = (String) tmpIter.next();
			put((K) key, (V) tmpHm.get(key));
		}

	}

	/**
	 * 
	 * <pre>
	 * 내부 key 를 대문자로 변경한다.
	 * </pre>
	 * 
	 * void
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void toUpperKeyAll() {

		Iterator<?> iter = keySet().iterator();
		String key = "";
		String upKey = "";
		HashMap tmpHm = new HashMap();
		while (iter.hasNext()) {
			key = (String) iter.next();
			upKey = StringUtils.upperCase(key);
			tmpHm.put(upKey, get(key));

		}

		clear();

		Iterator<?> tmpIter = tmpHm.keySet().iterator();
		while (tmpIter.hasNext()) {
			key = (String) tmpIter.next();
			put((K) key, (V) tmpHm.get(key));
		}

	}

	@SuppressWarnings("unchecked")
	public void changeKey(String orgKey, String chgKey) {
		put((K) chgKey, get(orgKey));
		remove(orgKey);

	}

	@SuppressWarnings("unchecked")
	public void copyKey(String orgKey, String cpKey) {

		/* 세션값을 변수에 바인딩 할때는 변수 값이 nul(없을시) 이여야만 넣으수 있게 처리 */
		// if (StringUtils.indexOfAny(orgKey, "s_") == 0) {
		// if ((Object) get(cpKey)==null||"".equals((Object) get(cpKey)) ) {
		// put((K) cpKey, super.get(orgKey));
		// }
		// } else {
		// put((K) cpKey, super.get(orgKey));
		//
		// }

		put((K) cpKey, super.get(orgKey));
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public DataMap toArrayAll() {

		String key = "";
		DataMap<String, Object> rtnRecord = new DataMap<String, Object>();
		rtnRecord.putAll((HashMap<? extends String, ? extends Object>) this);

		Iterator<?> iter = keySet().iterator();
		while (iter.hasNext()) {
			key = (String) iter.next();
			if (!(this.get(key) instanceof Object[])) {// 값이 배열이 아닌 경우만
														// 작업=======

				Object[] arr = new Object[arrSize];
				for (int i = 0; i < arrSize; i++) {// 배열을 채워준다.

					if (this.get(key) != null && this.get(key) != "") {// Null 이
																		// 아니면
						arr[i] = String.valueOf(this.get(key));
					} else {// Null이면
						arr[i] = "";
					}
				}// end for
				rtnRecord.put(key, arr);
			}// end if Object[]
		}// end while
		return rtnRecord;
	}

	@SuppressWarnings("rawtypes")
	public DataMap getArray(int i) {

		String key = "";
		DataMap<String, Object> rtnRecord = new DataMap<String, Object>();

		Object[] arr = new Object[arrSize];

		Iterator<?> iter = keySet().iterator();
		try {

			while (iter.hasNext()) {
				key = (String) iter.next();

				arr = (Object[]) this.get(key);
				rtnRecord.put(key, String.valueOf(arr[i]));

			}

		} catch (Exception e) {
			log.debug("Exception Info : " + key + " (" + (i + 1) + "/"
					+ arr.length + ", " + i + ")");
			e.printStackTrace();

		}

		return rtnRecord;
	}

	public int getKeyCount(String key) {

		String[] value = null;
		int cnt = 0;

		if (get(key) instanceof String[]) {// String[]
			value = (String[]) (get(key));// output은 String or String[]
			for (int validx = 0; validx < value.length; validx++) {
				cnt++;
			}
		} else if (get(key) instanceof String) {// String
			cnt++;
		}

		return cnt;
	}
}
