<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  .table{border: 1px solid;border-collapse:collapse; border-spacing:0px; margin-top:50px; display:none;}
  .table th{width: 100px}
  .table th, table td{border: 1px solid;  padding: 5px}
</style>
</head>
<body>
  <label for="id">삭제할 아이디 입력</label>
  <input type="text" id="searchId" name="searchId">
  <input type="button" id="btn-searchId" value="아이디 검색">
  <div id="searchIdDiv"></div>
  <form id="deleteForm" method="post" action="">
  <table id="table" class="table">
	<tr>
	  <td>이름</td>
	  <td>
	    <input type="text" id="name" name="name" readonly>
	  </td>	  
	</tr>
	<tr>
	  <td>아이디</td>
	  <td><input type="text" id="id" name="id" readonly></td>	  
	</tr>
	<tr>
	  <td>비밀번호</td>
	  <td>
	    <input type="text" id="pwd" name="pwd" readonly>
      </td>	  
	</tr>
	<tr>
	  <td colspan="2" style="text-align:center;">
	      <input type="button" id="deleteBtn" value="삭제">
	      <input type="reset" value="취소">
	  </td>
	</tr>
  </table>
  </form>
  <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
  <script type="text/javascript">
      $('#btn-searchId').click(function(){
          let id = $('#searchId').val();
          $.ajax({
        	  type:'POST',
        	  url: '/chapter06_SpringWebMaven/user/searchId',
        	  data: 'id='+id, 
  			  dataType:'json',
  			  success: function(data){
			      if(data.userDTO!=null){
			    	  $('#table').show();
			    	  let userDTO = data.userDTO;
					  $('#name').val(userDTO.name);
					  $('#id').val(userDTO.id);
					  $('#pwd').val(userDTO.pwd);
				  }else if(data.userDTO==null){
					  $('#searchIdDiv').text('삭제할 아이디가 없습니다.')
					  $('#searchIdDiv').css('color','red')
					  $('#searchIdDiv').css('font-size','8pt')
					  $('#searchIdDiv').css('font-weight','bold')
				  }
			  },
			  error: function(err){
				  alert(err);
				  consol.log(err);
			  }
          });
          
      });
      $('#deleteBtn').click(function(){
    	  let choice = confirm("정말로 삭제하시겠습니까?");
    	  if(choice){
   			$.ajax({
   				type: 'POST',
   				url: '/chapter06_SpringWebMaven/user/delete',
   				data: $('#id'),
   				success: function(){
   					alert('아이디를 삭제했습니다!!');
   				}
   			});
    		}
    	});
  </script>
</body>
</html>