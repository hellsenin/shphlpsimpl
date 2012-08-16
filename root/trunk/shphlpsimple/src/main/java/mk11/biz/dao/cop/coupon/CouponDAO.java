package mk11.biz.dao.cop.coupon;

import mk11.app.DataRecord;

import org.springframework.stereotype.Repository;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("couponDAO")
public class CouponDAO extends EgovComAbstractDAO {

	

	@SuppressWarnings("rawtypes")
	public DataRecord select(DataRecord dataRecord) throws Exception {
		return (DataRecord) selectByPk("biz.cmm.cop.coupon.select", dataRecord);

	}

	public int update(DataRecord dataRecord) throws Exception {
		return update("coupon.update", dataRecord);
	}

}
