Ext.define("mvcGrid.view.userView",{
	extend : 'Ext.grid.Panel',
	alias : 'widget.userList',
	title : '用户信息',
	width : 450,
	height :　250,
	frame : true,
	columns : [{
		text : '用户名',
		dataIndex : 'name',
		width : 150
	},{
		text : '年龄',
		dataIndex : 'age',
		width : 50
	},{
		text : '联系方式',
		dataIndex : 'phone',
		width : 100
	}],
	store : 'userStore',
	 initComponent: function() {
	 	this.callParent();
	 }
});