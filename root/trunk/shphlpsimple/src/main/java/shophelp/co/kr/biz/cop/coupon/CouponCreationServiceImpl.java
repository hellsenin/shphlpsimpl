package shophelp.co.kr.biz.cop.coupon;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@Service("CouponCreationService")
public class CouponCreationServiceImpl extends AbstractServiceImpl implements
		CouponCreationService {

	@Resource(name = "shpTempDAO")
	private ShpTempDAO shpTempDAO;

//	public ShpTempVO selectCoupon(ShpTempVO vo) throws Exception {
//		return shpTempDAO.selectCoupon(vo);
//	}
//
//	public void updateUsedCoupon(ShpTempVO vo) throws Exception {
//
//		 shpTempDAO.updateUsedCoupon(vo);
//	}

}
