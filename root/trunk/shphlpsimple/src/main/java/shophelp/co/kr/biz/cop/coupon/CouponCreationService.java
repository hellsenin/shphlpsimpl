package shophelp.co.kr.biz.coupon.service;

import shophelp.co.kr.cmm.vo.ShpTempVO;

public interface CouponCreationService {

	public ShpTempVO selectCoupon(ShpTempVO vo) throws Exception;

	public void updateUsedCoupon(ShpTempVO vo) throws Exception;

}
