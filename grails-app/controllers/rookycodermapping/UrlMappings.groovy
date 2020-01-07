package rookycodermapping

class UrlMappings {

    static mappings = {
        name tool: "/tool/$controller/$action?/$id?" {}

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
