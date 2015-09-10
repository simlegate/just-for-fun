$(document).ready(function(){

  var toTopBtn = $(".top-btn")

  // 当前窗口的滚动事件 
  $(window).scroll(function() {
    var that = $(this);
    // console.log(that.scrollTop())
    if($(this).scrollTop() > 100) {
      toTopBtn.fadeIn();
    }else{
      toTopBtn.fadeOut();
    }
  })

  toTopBtn.click(function(e){
    // 取消事件的默认动作
    e.preventDefault();
    // 使用了$('html, body') 作为animate的dom，这样做的目的是为了兼容各浏览器
    // webkit 内核的浏览器使用body 进行滑动，而其他浏览器则使用html进行滑动
    $("body, html").animate({ scrollTop : 0 });
  })
})
