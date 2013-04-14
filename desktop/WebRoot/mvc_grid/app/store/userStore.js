Ext.define("mvcGrid.store.userStore",{
	extend : 'Ext.data.Store',
	model : 'mvcGrid.model.userModel',
	data : [
		{name : 'weilijun',age : 25, phone : '13556782122'},
		{name : 'xiaowang',age : 25, phone : '13556782122'},
		{name : 'chenxiaobing',age : 25, phone : '13556782122'}
	]
});