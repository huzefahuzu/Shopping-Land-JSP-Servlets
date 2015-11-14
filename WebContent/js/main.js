/*
 *  Document   : main.js
 *  Author     : pixelcave
 */
var webApp=function(){var t=function(){var t=$("#year-copy"),e=new Date;2013===e.getFullYear()?t.html("2013"):t.html("2013-"+e.getFullYear());var i=$("#page-content");i.css("min-height",$(window).height()-($("header").height()+2*parseInt(i.css("padding-top"))+$("footer").outerHeight())+"px"),$(window).resize(function(){i.css("min-height",$(window).height()-($("header").height()+2*parseInt(i.css("padding-top"))+$("footer").outerHeight())+"px")}),$("header").hasClass("navbar-fixed-top")?$("#page-container").css("padding","40px 0 0"):$("header").hasClass("navbar-fixed-bottom")&&$("#page-container").css("padding","0 0 40px"),$("thead input:checkbox").click(function(){var t=$(this).prop("checked"),e=$(this).closest("table");$("tbody input:checkbox",e).each(function(){$(this).prop("checked",t)})}),$('[data-toggle="tabs"] a').click(function(t){t.preventDefault(),$(this).tab("show")}),$('[data-toggle="gallery-options"] > li').mouseover(function(){$(this).find(".thumbnails-options").show()}).mouseout(function(){$(this).find(".thumbnails-options").hide()}),$(".scrollable").slimScroll({height:"100px",size:"3px",touchScrollStep:750}),$(".scrollable-tile").slimScroll({height:"130px",size:"3px",touchScrollStep:750}),$(".scrollable-tile-2x").slimScroll({height:"330px",size:"3px",touchScrollStep:750}),$('[data-toggle="tooltip"]').tooltip({container:"body",animation:!1}),$('[data-toggle="popover"]').popover({container:"body",animation:!1}),$(".select-chosen").chosen(),$(".input-switch").bootstrapSwitch(),$("textarea.textarea-elastic").elastic(),$("textarea.textarea-editor").wysihtml5(),$(".input-colorpicker").colorpicker(),$(".input-timepicker").timepicker(),$(".input-datepicker").datepicker(),$(".input-daterangepicker").daterangepicker()},e=function(){$(".loading-on").click(function(){var t=$("#loading");t.fadeIn(250),$("#widgets > li > a > .badge").hide(250),setTimeout(function(){t.fadeOut(250),$("#rss-widget > a > .badge").show(250).html("5"),$("#twitter-widget > a > .badge").show(250).html("4")},1e3)});var t=["Afghanistan","Albania","Algeria","American Samoa","Andorra","Angola","Anguilla","Antarctica","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bermuda","Bhutan","Bolivia","Bosnia and Herzegovina","Botswana","Bouvet Island","Brazil","British Indian Ocean Territory","British Virgin Islands","Brunei","Bulgaria","Burkina Faso","Burundi","Côte d'Ivoire","Cambodia","Cameroon","Canada","Cape Verde","Cayman Islands","Central African Republic","Chad","Chile","China","Christmas Island","Cocos (Keeling) Islands","Colombia","Comoros","Congo","Cook Islands","Costa Rica","Croatia","Cuba","Cyprus","Czech Republic","Democratic Republic of the Congo","Denmark","Djibouti","Dominica","Dominican Republic","East Timor","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia","Faeroe Islands","Falkland Islands","Fiji","Finland","Former Yugoslav Republic of Macedonia","France","French Guiana","French Polynesia","French Southern Territories","Gabon","Georgia","Germany","Ghana","Gibraltar","Greece","Greenland","Grenada","Guadeloupe","Guam","Guatemala","Guinea","Guinea-Bissau","Guyana","Haiti","Heard Island and McDonald Islands","Honduras","Hong Kong","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya","Kiribati","Kuwait","Kyrgyzstan","Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macau","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Martinique","Mauritania","Mauritius","Mayotte","Mexico","Micronesia","Moldova","Monaco","Mongolia","Montserrat","Morocco","Mozambique","Myanmar","Namibia","Nauru","Nepal","Netherlands","Netherlands Antilles","New Caledonia","New Zealand","Nicaragua","Niger","Nigeria","Niue","Norfolk Island","North Korea","Northern Marianas","Norway","Oman","Pakistan","Palau","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Pitcairn Islands","Poland","Portugal","Puerto Rico","Qatar","Réunion","Romania","Russia","Rwanda","São Tomé and Príncipe","Saint Helena","Saint Kitts and Nevis","Saint Lucia","Saint Pierre and Miquelon","Saint Vincent and the Grenadines","Samoa","San Marino","Saudi Arabia","Senegal","Seychelles","Sierra Leone","Singapore","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa","South Georgia and the South Sandwich Islands","South Korea","Spain","Sri Lanka","Sudan","Suriname","Svalbard and Jan Mayen","Swaziland","Sweden","Switzerland","Syria","Taiwan","Tajikistan","Tanzania","Thailand","The Bahamas","The Gambia","Togo","Tokelau","Tonga","Trinidad and Tobago","Tunisia","Turkey","Turkmenistan","Turks and Caicos Islands","Tuvalu","US Virgin Islands","Uganda","Ukraine","United Arab Emirates","United Kingdom","United States","United States Minor Outlying Islands","Uruguay","Uzbekistan","Vanuatu","Vatican City","Venezuela","Vietnam","Wallis and Futuna","Western Sahara","Yemen","Yugoslavia","Zambia","Zimbabwe"];$(".example-typeahead").typeahead({items:5,source:t}),$("#example-user-tabs a").click(function(t){t.preventDefault(),$(this).tab("show")});var e=$("#example-advanced-daterangepicker"),i=$("#example-advanced-daterangepicker span");e.daterangepicker({ranges:{Today:["today","today"],Yesterday:["yesterday","yesterday"],"Last 7 Days":[Date.today().add({days:-6}),"today"],"Last 30 Days":[Date.today().add({days:-29}),"today"],"This Month":[Date.today().moveToFirstDayOfMonth(),Date.today().moveToLastDayOfMonth()],"Last Month":[Date.today().moveToFirstDayOfMonth().add({months:-1}),Date.today().moveToFirstDayOfMonth().add({days:-1})]}},function(t,e){i.html(t.toString("MMMM d, yy")+" - "+e.toString("MMMM d, yy"))}),i.html(Date.today().toString("MMMM d, yy")+" - "+Date.today().toString("MMMM d, yy"))},i=function(){var t=$("#primary-nav > ul > li > a");t.filter(function(){return $(this).next().is("ul")}).each(function(t,e){$(e).append("<span>"+$(e).next("ul").children().length+"</span>")}),t.click(function(){var t=$(this);return t.next("ul").length>0?(t.parent().hasClass("active")!==!0&&(t.hasClass("open")?t.removeClass("open").next().slideUp(250):($("#primary-nav li > a.open").removeClass("open").next().slideUp(250),t.addClass("open").next().slideDown(250))),!1):!0})},n=function(){var t=$("#to-top");$(window).scroll(function(){$(this).scrollTop()>150?t.fadeIn(150):t.fadeOut(150)}),t.click(function(){return $("html, body").animate({scrollTop:0},300),!1})},r=function(){var t=$("#topt-fixed-header-top"),e=$("#topt-fixed-header-bottom"),i=$("#topt-fixed-layout"),n=$("header");$(".btn-theme-options").click(function(){return $(this).toggleClass("open"),$("#theme-options-content").slideToggle(200),!1}),t.on("switch-change",function(t,i){i.value===!0?(e.bootstrapSwitch("setState",!1),n.addClass("navbar-fixed-top"),$(window).width()>980&&$("#page-container").css("padding","40px 0 0")):(n.removeClass("navbar-fixed-top"),$("#page-container").css("padding","0"))}),e.on("switch-change",function(e,i){i.value===!0?(t.bootstrapSwitch("setState",!1),n.addClass("navbar-fixed-bottom"),$(window).width()>980&&$("#page-container").css("padding","0 0 40px")):n.removeClass("navbar-fixed-bottom")}),i.on("switch-change",function(t,e){e.value===!0?$("body").addClass("fixed"):$("body").removeClass("fixed")});var r,a=$(".theme-colors"),s=$("#theme-link");s.length&&(r=s.attr("href"),$("li",a).removeClass("active"),$('a[data-theme="'+r+'"]',a).parent("li").addClass("active")),$("a",a).click(function(){r=$(this).data("theme"),$("li",a).removeClass("active"),$(this).parent("li").addClass("active"),"default"===r?s.length&&(s.remove(),s=$("#theme-link")):s.length?s.attr("href",r):($('link[href="css/main.css"]').after('<link id="theme-link" rel="stylesheet" href="'+r+'">'),s=$("#theme-link"))})},a=function(){Modernizr.input.placeholder||$("[placeholder]").focus(function(){var t=$(this);t.val()===t.attr("placeholder")&&(t.val(""),t.removeClass("ph"))}).blur(function(){var t=$(this);(""===t.val()||t.val()===t.attr("placeholder"))&&(t.addClass("ph"),t.val(t.attr("placeholder")))}).blur().parents("form").submit(function(){$(this).find("[placeholder]").each(function(){var t=$(this);t.val()===t.attr("placeholder")&&t.val("")})})},s=function(){$.extend(!0,$.fn.dataTable.defaults,{sDom:"<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span5'i><'span7'p>>",sPaginationType:"bootstrap",oLanguage:{sLengthMenu:"_MENU_",sSearch:'<div class="input-prepend"><span class="add-on"><i class="icon-search"></i></span>_INPUT_</div>',sInfo:"<strong>_START_</strong>-<strong>_END_</strong> of <strong>_TOTAL_</strong>",oPaginate:{sPrevious:"",sNext:""}}}),$.extend($.fn.dataTableExt.oStdClasses,{sWrapper:"dataTables_wrapper form-inline"}),$.fn.dataTableExt.oApi.fnPagingInfo=function(t){return{iStart:t._iDisplayStart,iEnd:t.fnDisplayEnd(),iLength:t._iDisplayLength,iTotal:t.fnRecordsTotal(),iFilteredTotal:t.fnRecordsDisplay(),iPage:Math.ceil(t._iDisplayStart/t._iDisplayLength),iTotalPages:Math.ceil(t.fnRecordsDisplay()/t._iDisplayLength)}},$.extend($.fn.dataTableExt.oPagination,{bootstrap:{fnInit:function(t,e,i){var n=t.oLanguage.oPaginate,r=function(e){e.preventDefault(),t.oApi._fnPageChange(t,e.data.action)&&i(t)};$(e).addClass("pagination").append('<ul><li class="prev disabled"><a href="javascript:void(0)"><i class="icon-chevron-left"></i> '+n.sPrevious+"</a></li>"+'<li class="next disabled"><a href="javascript:void(0)">'+n.sNext+' <i class="icon-chevron-right"></i></a></li>'+"</ul>");var a=$("a",e);$(a[0]).bind("click.DT",{action:"previous"},r),$(a[1]).bind("click.DT",{action:"next"},r)},fnUpdate:function(t,e){var i,n,r,a,s,o=5,l=t.oInstance.fnPagingInfo(),h=t.aanFeatures.p,d=Math.floor(o/2);for(l.iTotalPages<o?(a=1,s=l.iTotalPages):l.iPage<=d?(a=1,s=o):l.iPage>=l.iTotalPages-d?(a=l.iTotalPages-o+1,s=l.iTotalPages):(a=l.iPage-d+1,s=a+o-1),i=0,iLen=h.length;iLen>i;i++){for($("li:gt(0)",h[i]).filter(":not(:last)").remove(),n=a;s>=n;n++)r=n===l.iPage+1?'class="active"':"",$("<li "+r+'><a href="javascript:void(0)">'+n+"</a></li>").insertBefore($("li:last",h[i])[0]).bind("click",function(i){i.preventDefault(),t._iDisplayStart=(parseInt($("a",this).text(),10)-1)*l.iLength,e(t)});0===l.iPage?$("li:first",h[i]).addClass("disabled"):$("li:first",h[i]).removeClass("disabled"),l.iPage===l.iTotalPages-1||0===l.iTotalPages?$("li:last",h[i]).addClass("disabled"):$("li:last",h[i]).removeClass("disabled")}}}})};return{init:function(){t(),e(),i(),n(),r(),a(),s()}}}();$(function(){webApp.init()});