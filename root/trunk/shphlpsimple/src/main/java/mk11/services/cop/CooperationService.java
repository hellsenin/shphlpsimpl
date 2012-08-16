package shophelp.co.kr.biz.services.cop;

import mk11.app.DataRecord;


public interface CooperationService {

	public DataRecord select(DataRecord dataRecord) throws Exception;

	public void update(DataRecord dataRecord) throws Exception;

}
