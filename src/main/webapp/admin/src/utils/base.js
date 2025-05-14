const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmj1207/",
            name: "ssmj1207",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmj1207/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "音乐网站"
        } 
    }
}
export default base
