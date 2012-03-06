package shophelp.co.kr.biz.dao.cop.coupon;

import org.springframework.stereotype.Repository;

import shophelp.co.kr.app.DataRecord;
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
