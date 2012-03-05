package shophelp.co.kr.biz.coupon.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import shophelp.co.kr.biz.coupon.dao.ShpTempDAO;
import shophelp.co.kr.biz.coupon.service.CouponCreationService;
import shophelp.co.kr.cmm.vo.ShpTempVO;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@Service("CouponCreationService")
public class CouponCreationServiceImpl extends AbstractServiceImpl implements
		CouponCreationService {

	@Resource(name = "shpTempDAO")
	private ShpTempDAO shpTempDAO;

	public ShpTempVO selectCoupon(ShpTempVO vo) throws Exception {
		return shpTempDAO.selectCoupon(vo);
	}

	public void updateUsedCoupon(ShpTempVO vo) throws Exception {

		 shpTempDAO.updateUsedCoupon(vo);
	}

}
