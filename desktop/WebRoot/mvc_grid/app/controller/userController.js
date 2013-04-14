Ext.define("mvcGrid.controller.userController",{
	extend : 'Ext.app.Controller',
	init : function(){
		this.control({})
	},
	models : ['userModel'],
	stores : ['userStore'],
	views : ['userView']
});