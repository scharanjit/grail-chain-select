import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

/**
 * Created by charanjiths on 19/8/16.
 */
class Application extends GrailsAutoConfiguration{
    static void main (String[] args){
        GrailsApp.run(Application,args)
    }
}
