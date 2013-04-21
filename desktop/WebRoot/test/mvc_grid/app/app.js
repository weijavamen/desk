(function(){
	Ext.onReady(function(){
		
		Ext.QuickTips.init();
		Ext.Loader.setConfig({
			enabled : true
		});
		
		Ext.application({
			name : 'mvcGrid',
			appFolder : 'mvc_grid/app',
			launch : function(){                   //当页面加载完成后，执行该函数
				Ext.create("Ext.container.Viewport",{
					layout : 'auto',
					items : {
						xtype : 'userList',
						title : 'test',
						html : 'set'
					}
				});
			},
			controllers : ['userController']
		});
	});
})();