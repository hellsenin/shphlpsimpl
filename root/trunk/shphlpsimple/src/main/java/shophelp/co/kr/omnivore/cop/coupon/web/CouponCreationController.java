package shophelp.co.kr.omnivore.cpn.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import shophelp.co.kr.biz.coupon.service.CouponCreationService;
import shophelp.co.kr.cmm.vo.ShpTempVO;

@Controller
public class CouponCreationController {

	/** EgovCmmUseService */
	@Resource(name = "CouponCreationService")
	private CouponCreationService couponCreationService;

	protected Log log = LogFactory.getLog(this.getClass());

	@RequestMapping(value = "/omnivore/pb/cpn/CouponCreation.do")
	public String getCoupon(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {

		ShpTempVO vo = new ShpTempVO();

		ShpTempVO shptempVO = couponCreationService.selectCoupon(vo);

		if (shptempVO.getTmp_col01() != null) {
			
			shptempVO.setTmp_col02(request.getRemoteAddr());
			shptempVO.setTmp_col03(request.getRemoteHost());
			shptempVO.setTmp_col04(request.getRemoteUser());
			couponCreationService.updateUsedCoupon(shptempVO);

		}

		model.addAttribute("SHPTEMP", shptempVO);
		return "shophelp/co/kr/omnivore/pb/cpn/CouponView";
	}

}