<%@ page language="java" errorPage="/WEB-INF/jsp/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%-- Success Messages --%>
<c:if test="${not empty message}">
	<div class="message" id="messages"><c:out value="${message}" /></div>


	<script type="text/javascript">
		var hID = null;
		var opacityValue = 100; //붙투명도 값
		window.setTimeout("GoFadeOut()", 1000);
	
		function GoFadeOut() {
			// FadeOut 기능 시작 - 1/200초로 divArrowLayer_FadeOut함수가 호출 되면서 레이어의 불투명도값을 2씩 줄인다
			hID = setInterval("divArrowLayer_FadeOut()", 50);
		}
	
		function divArrowLayer_FadeOut() {
			if (opacityValue > 0) {
				document.getElementById("messages").style.filter = 'Alpha(Opacity='
						+ opacityValue + ')';
				opacityValue -= 2;
			} else {
				// 불투명도 값이 0이되면 기존 타임아웃 삭제
				clearInterval(hID);
				document.getElementById("messages").style.height = 0;
				height:50
				
			}
		}
	</script>
</c:if>
