$('#writeBtn').click(function(){
	$('#nameDiv').empty();
	$('#idDiv').empty();
	$('#pwdDiv').empty();
	
	if($('#name').val()==''){
		$('#nameDiv').text('이름 입력')
		$('#nameDiv').css('color','red')
		$('#nameDiv').css('font-size','8pt')
		$('#nameDiv').css('font-weight','bold')
	
	}else if($('#id').val()==''){
		$('#idDiv').text('아이디 입력')
		$('#idDiv').css('color','red')
		$('#idDiv').css('font-size','8pt')
		$('#idDiv').css('font-weight','bold')
	
	}else if($('#pwd').val()==''){
		$('#pwdDiv').text('비밀번호 입력')
		$('#pwdDiv').css('color','red')
		$('#pwdDiv').css('font-size','8pt')
		$('#pwdDiv').css('font-weight','bold')
	
	}else{
		$.ajax({
			type: 'POST',
			url: '/chapter06_SpringWebMaven/user/write',
			data: $('#writeForm').serialize(),
			success: function(){
				alert('회원가입을 축하합니다!');
			}
			
		});
	}
});

$('#id').focusout(function(){
	$('#idDiv').empty();
	if($('#id').val()==''){
		$('#idDiv').text('필수 정보 입력')
		$('#idDiv').css('color','magenta')
		$('#idDiv').css('font-size','8pt')
		$('#idDiv').css('font-weight','bold')
	}else {
		$.ajax({
			type: 'POST',
			url: '/chapter06_SpringWebMaven/user/checkId',
			data: 'id='+$('#id').val(), 
			dataType:'text',
			success: function(data){
				if(data=='non_exist'){
					$('#idDiv').text('사용 가능')
					$('#idDiv').css('color','blue')
					$('#idDiv').css('font-size','8pt')
					$('#idDiv').css('font-weight','bold')
				}else if(data=='exist'){
					$('#idDiv').text('사용 불가')
					$('#idDiv').css('color','red')
					$('#idDiv').css('font-size','8pt')
					$('#idDiv').css('font-weight','bold')
				}
			},
			error: function(err){
				alert(err);
				console.log(err);
			}
		});
	}
});
