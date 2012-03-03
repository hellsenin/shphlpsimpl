	<div id="account">
	    <h3 class="accessibility">login</h3>
	    
	<%
	if(login==null){%> 
		<form:form action="${ctx}/member/loginMember.html" accept-charset="UTF-8" method="POST" commandName="member">
			<fieldset id="loginfieldset"><legend>Account</legend>
				<div id="uid">
					<span id="id"><label for="id">ID </label><input type="text" name="id" id="id" maxlength="50" value="" title="ID" tabindex="<%=++accountTabindex %>" style = "ime-mode:inactive" /></span> 
					<br>
					<span id="inputPwd"><label for="inputPwd">PASS </label><input type="password" name="passwd" id="passwd" maxlength="32" value="" title="PASS" tabindex="<%=++accountTabindex %>" /></span>
				</div>
				
				<div id="btn">
					<input type="checkbox" name="saved_id" id="sid" title="saved_id" tabindex="<%=++accountTabindex %>" /><label for="sid">ID save</label>
					<button type="submit" id="loginSubmit" title="Login" tabindex="<%=++accountTabindex %>"><span>LogIn</span></button>
				</div>
				
				<div id="user">
					<span id="join"><a href="${ctx}/member/getMember.html?id=&cmd=C">Join</a></span> | 
					<span id="find"> <a href="${ctx}/member/joinForm.html">IdFind</a></span> | 
					<span id="find"> <a href="${ctx}/member/joinForm.html" class="pwd">PassFind</a></span>
				</div>
				
			</fieldset>
		</form:form>
		
    <%}else {%>
        <form:form action="${ctx}/member/logoutMember.html" accept-charset="UTF-8" method="POST" commandName="member">
            <fieldset id="loginfieldset"><legend>Account</legend>
                <div id="uid">
                
                    <span id="id"><%=login.getCompany() %>&nbsp;&trade;</span> 
                	<br>
                	<span id="join">
                		<a href="${ctx}/member/getMember.html?id=<%=login.getId() %>&cmd=U">
                			<%=login.getLastName() %> <fmt:message key="account.position" />
                		</a>
                	</span>
                	<br>
                	<span><fmt:message key="account.introduce" /></span>
                	<br>
                    <span id="id">(<%=login.getId() %>)</span> 
                </div>
                <div id="btn">
                    <button type="submit" id="logoutSubmit" title="LogOut" tabindex="5"><span>LogOut</span></button>
                </div>   
            </fieldset>
        </form:form>
             
    <%} %>          
                   		
	</div>
