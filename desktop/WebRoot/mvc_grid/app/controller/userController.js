Ext.define("mvcGrid.controller.userController",{
	extend : 'Ext.app.Controller',
	init : function(){
		this.control({
			'userList button[id=add]' : {
				click : function(e){
					alert(e.text);
				}
			}
		});
	},
	models : ['userModel'],
	stores : ['userStore'],
	views : ['userView']
});