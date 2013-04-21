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
	dockedItems : [{
		xtype : 'toolbar',
		dock : 'top',
		items : [
			{text : '新增',xtype : 'button',id : 'add'},
			{text : '修改',xtype : 'button',id : 'update'},
			{text : '删除',xtype : 'button',id : 'delete'}
		]
	}],
	store : 'userStore',
	 initComponent: function() {
	 	this.callParent();
	 }
});