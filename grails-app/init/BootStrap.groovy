import grails.chain.select.*;

class BootStrap {

    def init = { servletContext ->
        if ( Category.count() == 0 ) {
            Category color = new Category(name:'Color').save()
            new SubCategory(category:color, name:'Red').save()
            new SubCategory(category:color, name:'Green').save()
            new SubCategory(category:color, name:'Blue').save()
            Category shape = new Category(name:'Shape').save()
            new SubCategory(category:shape, name:'Square').save()
            new SubCategory(category:shape, name:'Circle').save()
            Category size = new Category(name:'Size').save()
            new SubCategory(category:size, name:'Small').save()
            new SubCategory(category:size, name:'Medium').save()
            new SubCategory(category:size, name:'Large').save()
        }
    }
    def destroy = {
    }
}
