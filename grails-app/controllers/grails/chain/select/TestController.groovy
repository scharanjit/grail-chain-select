package grails.chain.select

class TestController {
//    static scaffold=Category

    def form() {
    }

    def categoryChanged(long categoryId) {
        Category category = Category.get(categoryId)
        def subCategories = []
        if ( category != null ) {
            subCategories = SubCategory.findAllByCategory(category, [order:'name'])
        }

        render g.select(id:'subCategory', name:'subCategory.id',
                from:subCategories, optionKey:'id', noSelection:[null:' ']
        )
    }
}
