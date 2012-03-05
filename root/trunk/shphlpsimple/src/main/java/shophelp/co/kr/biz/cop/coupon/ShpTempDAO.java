package shophelp.co.kr.biz.coupon.dao;

import org.springframework.stereotype.Repository;

import shophelp.co.kr.cmm.vo.ShpTempVO;
import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository("shpTempDAO")
public class ShpTempDAO extends EgovComAbstractDAO {

	/*
	 * @SuppressWarnings("unchecked") public List<ShpTempVO>
	 * selectCoupon(ShpTempVO vo) throws Exception { return
	 * list("ShpTemp.selectCoupon", vo); }
	 */

	public ShpTempVO selectCoupon(ShpTempVO vo) throws Exception {
		return (ShpTempVO) selectByPk("ShpTemp.selectCoupon", vo);

	}

	public int updateUsedCoupon(ShpTempVO vo) throws Exception {
		return update("ShpTemp.updateUsedCoupon", vo);
	}

}
