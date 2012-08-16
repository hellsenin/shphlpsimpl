package mk11.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class DataRecord<K, V> extends HashMap<K, V> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1682164252025902792L;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String toStringAll() {

		Vector vt = new Vector(keySet());
		Collections.sort(vt);

		// -----------
		String[] value = null;

		// Iterator<?> iter = keySet().iterator();
		Iterator<?> iter = vt.iterator();
		StringBuffer sb = new StringBuffer();

		sb.append("\n[\n ");

		while (iter.hasNext()) {
			String key = (String) iter.next();
			if (get(key) instanceof String) {
				sb.append(key + " = " + get(key) + " ;\n ");

			} else {// String[]

				value = (String[]) get(key);// output은 String or String[]
				for (int validx = 0; validx < value.length; validx++) {
					sb.append(key + "[" + validx + "]" + " = " + value[validx] + " ;\n ");
				}
			}
		}
		return sb.append("]").toString();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String toStringKey() {
		Vector vt = new Vector(keySet());
		Collections.sort(vt);

		Iterator<?> iter = vt.iterator();
		StringBuffer sb = new StringBuffer();
		sb.append("\n[\n ");

		while (iter.hasNext()) {
			String key = (String) iter.next();
			sb.append(key + " ;\n ");

		}
		return sb.append("]").toString();
	}

	/**
	 * key값을 소문자로 변경해서 입력함.
	 * 
	 * @param m
	 *            mappings to be stored in this map
	 */
	public void putlowerCaseKeyAll(Map<? extends K, ? extends V> m) {
		for (Map.Entry<? extends K, ? extends V> e : m.entrySet()) {
			if (e.getKey() instanceof String) {
				put((K) StringUtils.lowerCase(e.getKey().toString()), e.getValue());
			} else {
				put(e.getKey(), e.getValue());
			}

		}

	}

}
