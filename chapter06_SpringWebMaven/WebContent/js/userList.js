/**
 * 
 */
let searchOption;
let searchText;
$(document).ready(function(){
	searchOption='';
	searchText='';
	var search={'searchOption': searchOption,'searchText': searchText};
    $.ajax({
	    type: 'post',
        url: '/chapter06_SpringWebMaven/user/getUserList',
        data: search,
        dataType:'json',
        success:function(data){
	   //alert(JSON.stringify(data));
        	$.each(data.list, function(index, items){
        		$('<tr/>').append($('<td/>',{
        										align: 'center',
        										text: items.name
        				})).append($('<td/>',{
        										align: 'center',
        										text: items.id
        				})).append($('<td/>',{
        										align: 'center',
        										text: items.pwd
				})).appendTo('#table');
    		});
	   }
	   
   });
});

$('#searchBtn').click(function(){
	searchOption = $('#searchOption').val();
	searchText = $('#searchText').val();
	if(searchOption=='select'){
		alert('카테고리를 선택해주세요.');
	}else{
		var search={'searchOption': searchOption,'searchText': searchText};
		$.ajax({
			type: 'post', 
			url: '/chapter06_SpringWebMaven/user/getUserList', 
			data: search, 
			dataType:'json', 
			success: function(data){
				$('#table tr').remove();
				$('<tr/>').append($('<th/>',{
					align: 'center',
					text: '이름'
					})).append($('<th/>',{
						align: 'center',
						text: '아이디'
					})).append($('<th/>',{
						align: 'center',
						text: '비밀번호'
					})).appendTo('#table');
				$.each(data.list, function(index, items){
	        		$('<tr/>').append($('<td/>',{
	        										align: 'center',
	        										text: items.name
	        				})).append($('<td/>',{
	        										align: 'center',
	        										text: items.id
	        				})).append($('<td/>',{
	        										align: 'center',
	        										text: items.pwd
					})).appendTo('#table');
	    		});
				
			}
		});
	}
});