function openDic(){var e,a,i,n=hot.Methods.getSelected();n&&(e=n[0],e=hot.Methods.getCellMeta(e[0],e[1]).dic,i=a="",e&&(a=e.split("=")[0],i=e.split("=")[1]),layer.open({type:1,area:["554px","166px"],title:"字典项配置",content:$("#dataDic"),cancel:function(){},success:function(d,e){d.find("#dicds").empty(),d.find("#dicTypeVal").val(i);var t=getDataSetsNodesByParam("dic",!0);d.find("#dicds").append('<option value=""></option>'),$.each(t,function(e,t){d.find("#dicds").append('<option value="'+t.name+"."+t.keyName+'">'+t.name+"</option>")}),d.find("#dicds").val(a)},end:function(){},btn:["保存","取消"],yes:function(e,t){var d=t.find("#dicds").val(),a=t.find("#dicTypeVal").val(),t=n[0];d&&a?($("#parmdic").val(d+"="+a),hot.Methods.setCellMeta(t[0],t[1],"dic",d+"="+a)):($("#parmdic").val(""),(t=hot.Methods.getCellMeta(t[0],t[1])).dic="",delete t.dic),layer.close(e)},btn2:function(e,t){layer.close(e)}}))}function removeDataDic(){var e=hot.Methods.getSelected();e&&(e=e[0],(e=hot.Methods.getCellMeta(e[0],e[1])).dic="",delete e.dic,$("#parmdic").val(""))}