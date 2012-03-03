<div id="banner">
	<h3>Banner</h3>
    <img src="${ctx}/images/banner/naver.gif" title="http://naver.com" width="150" height="100" onclick="openBanner(this)"/>
    <br>
    <img src="${ctx}/images/banner/google.png" title="http://www.google.com" width="150" height="70" onclick="openBanner(this)"/>
	
</div>
	
<script type="text/javascript">
	function openBanner(obj) {
		window.open(obj.title);
	}
</script>