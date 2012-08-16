package shophelp.co.kr.biz.services.cop.coupon;

import javax.annotation.Resource;

import mk11.app.DataRecord;
import mk11.biz.dao.cop.coupon.CouponDAO;

import org.springframework.stereotype.Service;

import shophelp.co.kr.biz.services.cop.CooperationService;
import egovframework.rte.fdl.cmmn.AbstractServiceImpl;

@Service("couponService")
public class CouponService extends AbstractServiceImpl implements
		CooperationService {

	@Resource(name = "couponDAO")
	private CouponDAO couponDAO;

	public DataRecord select(DataRecord dataRecord) throws Exception {
		return couponDAO.select(dataRecord);
	}

	public void update(DataRecord dataRecord) throws Exception {

		couponDAO.update(dataRecord);
	}

}
