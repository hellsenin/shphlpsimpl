package shophelp.co.kr.app;

import java.util.HashMap;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import egovframework.com.cmm.LoginVO;

public class DataRecordMapArgumentResolver implements WebArgumentResolver {

	private Log log = LogFactory.getLog(this.getClass());

	/**
	 * 
	 * Ex) public String method(HttpServletRequest pmisReq){ PmisRecord pmis =
	 * (PmisRecord) pmisReq.getAttribute("pmisReq"); pmis.get("user_id");
	 * System.out.println("toStringAll() == : "+pmis.toStringAll());
	 * //Business~~!! Object = biz(); pmisReq.setAttribute("KEY", Object);
	 * return "cm/login/loginHidden"; }
	 * 
	 * @see org.springframework.web.bind.support.WebArgumentResolver#resolveArgument(org.springframework.core.MethodParameter,
	 *      org.springframework.web.context.request.NativeWebRequest)
	 * @param methodParameter
	 * @param webRequest
	 * @return
	 * @throws Exception
	 */
	public Object resolveArgument(MethodParameter methodParameter,
			NativeWebRequest webRequest) throws Exception {

		Class<?> clazz = methodParameter.getParameterType();
		String paramName = methodParameter.getParameterName();

		if (clazz.equals(DataRecord.class) && paramName.equals("dataRecord")) {

			/* form values 바인딩 */
			HashMap<String, Object> form = new HashMap<String, Object>();
			String[] value = null;
			int valueSize = 0;
			HashMap<?, ?> param = (HashMap<?, ?>) webRequest.getParameterMap();
			Iterator<?> iter = param.keySet().iterator();
			while (iter.hasNext()) {
				String key = (String) iter.next();
				value = (String[]) param.get(key);
				valueSize = value.length;
				if (valueSize == 1) {
					for (int validx = 0; validx < value.length; validx++) {
						form.put(key, value[validx]);
					}
				} else {
					form.put(key, value);
				}
			}

			/* session values 바인딩 */
			// if (sessionUtil.getSession(request.getSession()) != null) {
			//
			// LoginVO login = sessionUtil.getSession(request.getSession());
			//
			// form.put("s_user_id", login.getUser_id());
			// form.put("s_user_nm", login.getUser_nm());
			// }
			//
			DataRecord dataRecord = new DataRecord();
			dataRecord.putAll(form);

			if (log.isDebugEnabled()) {
				log.debug("dataRecord.toStringKey() : "
						+ dataRecord.toStringKey());
				log.debug("dataRecord.toStringAll() : "
						+ dataRecord.toStringAll());
			}

			return dataRecord;
		}
		return UNRESOLVED;
	}
}