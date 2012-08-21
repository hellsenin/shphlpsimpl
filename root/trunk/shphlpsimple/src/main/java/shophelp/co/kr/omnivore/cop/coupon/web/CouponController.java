package shophelp.co.kr.omnivore.cop.coupon.web;

import javax.annotation.Resource;

import mk11.app.DataMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.com.cmm.annotation.IncludedInfo;

@Controller
public class CouponController {

	/** EgovCmmUseService */
	@Resource(name = "couponCreationService")
	private CouponCreationService couponCreationService;

	protected Log log = LogFactory.getLog(this.getClass());

	@SuppressWarnings("rawtypes")
	@IncludedInfo(name = "쿠폰생성", order = 386, gid = 40)
	@RequestMapping(value = "/omnivore/pb/cpn/CouponCreation.do")
	public String getCoupon(ModelMap model, DataMap dataRecord)
			throws Exception {

		System.out.println("fff");
		DataMap dataRecordd = couponCreationService.selectCoupon(dataRecord);
		System.out.println("fff" + dataRecordd.get("TMP_COL00"));

		// if (shptempVO.getTmp_col01() != null) {
		//
		// shptempVO.setTmp_col02(request.getRemoteAddr());
		// shptempVO.setTmp_col03(request.getRemoteHost());
		// shptempVO.setTmp_col04(request.getRemoteUser());
		// couponCreationService.updateUsedCoupon(shptempVO);
		//
		// }

		model.addAttribute("SHPTEMP", dataRecordd);
		return "shophelp/co/kr/omnivore/pb/cpn/CouponView";
	}

}