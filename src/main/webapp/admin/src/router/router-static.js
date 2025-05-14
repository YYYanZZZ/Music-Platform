import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yinlebiaoqian from '@/views/modules/yinlebiaoqian/list'
    import discussfufeiyinle from '@/views/modules/discussfufeiyinle/list'
    import fufeiyinle from '@/views/modules/fufeiyinle/list'
    import dingdanzhongxin from '@/views/modules/dingdanzhongxin/list'
    import discussyinleku from '@/views/modules/discussyinleku/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import fufeiyinpin from '@/views/modules/fufeiyinpin/list'
    import storeup from '@/views/modules/storeup/list'
    import config from '@/views/modules/config/list'
    import yinleku from '@/views/modules/yinleku/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '音乐资讯',
        component: news
      }
          ,{
	path: '/yinlebiaoqian',
        name: '音乐标签',
        component: yinlebiaoqian
      }
          ,{
	path: '/discussfufeiyinle',
        name: '付费音乐评论',
        component: discussfufeiyinle
      }
          ,{
	path: '/fufeiyinle',
        name: '付费音乐',
        component: fufeiyinle
      }
          ,{
	path: '/dingdanzhongxin',
        name: '订单中心',
        component: dingdanzhongxin
      }
          ,{
	path: '/discussyinleku',
        name: '音乐库评论',
        component: discussyinleku
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
          ,{
	path: '/fufeiyinpin',
        name: '付费音频',
        component: fufeiyinpin
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/yinleku',
        name: '音乐库',
        component: yinleku
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
