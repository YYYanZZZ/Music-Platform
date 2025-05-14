
var projectName = '音乐网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '音乐库',
	url: './pages/yinleku/list.html'
}, 
{
	name: '付费音乐',
	url: './pages/fufeiyinle/list.html'
}, 

{
	name: '音乐资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmj1207/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"音乐标签","menuJump":"列表","tableName":"yinlebiaoqian"}],"menu":"音乐标签管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"音乐库","menuJump":"列表","tableName":"yinleku"}],"menu":"音乐库管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"付费音乐","menuJump":"列表","tableName":"fufeiyinle"}],"menu":"付费音乐管理"},{"child":[{"buttons":["查看","修改","删除","审核","付费音频"],"menu":"订单中心","menuJump":"列表","tableName":"dingdanzhongxin"}],"menu":"订单中心管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"付费音频","menuJump":"列表","tableName":"fufeiyinpin"}],"menu":"付费音频管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"音乐资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"音乐库列表","menuJump":"列表","tableName":"yinleku"}],"menu":"音乐库模块"},{"child":[{"buttons":["查看","购买"],"menu":"付费音乐列表","menuJump":"列表","tableName":"fufeiyinle"}],"menu":"付费音乐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","支付"],"menu":"订单中心","menuJump":"列表","tableName":"dingdanzhongxin"}],"menu":"订单中心管理"},{"child":[{"buttons":["查看","删除"],"menu":"付费音频","menuJump":"列表","tableName":"fufeiyinpin"}],"menu":"付费音频管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"音乐库列表","menuJump":"列表","tableName":"yinleku"}],"menu":"音乐库模块"},{"child":[{"buttons":["查看","购买"],"menu":"付费音乐列表","menuJump":"列表","tableName":"fufeiyinle"}],"menu":"付费音乐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
