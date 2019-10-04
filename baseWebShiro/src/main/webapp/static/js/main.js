$(function(){
	$(".changePage").click(function(){
		$("#rightMain").prop("src",$(this).data("url"));
	});
})