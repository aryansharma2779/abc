package conf;
import ninja.AssetsController;
import controllers.StockController;
import ninja.Router;
import ninja.application.ApplicationRoutes;
import controllers.ApplicationController;

public class Routes implements ApplicationRoutes {

    @Override
    public void init(Router router) {  
        
        router.GET().route("/").with(ApplicationController::index);
        router.GET().route("/hello_world.json").with(ApplicationController::helloWorldJson);
        router.GET().route("/contactForm").with(ApplicationController::addcontact);
        router.POST().route("/contactForm").with(ApplicationController::addcontact);
        
        
        router.GET().route("/buystock").with(StockController::index);
        router.GET().route("/add").with(StockController::add);
        router.GET().route("/delete").with(StockController::delete);
        router.GET().route("/update").with(StockController::update);
        
        
        router.GET().route("/additem").with(StockController::additem);
        router.POST().route("/additem").with(StockController::additem);
        
        router.GET().route("/deleteitem").with(StockController::deleteitem);
        router.POST().route("/deleteitem").with(StockController::deleteitem);
        
        //router.GET().route("/updateitem").with(StockController::updateitem);
        //router.POST().route("/updateitem").with(StockController::updateitem);
        ///////////////////////////////////////////////////////////////////////
        // Assets (pictures / javascript)
        ///////////////////////////////////////////////////////////////////////    
        router.GET().route("/assets/webjars/{fileName: .*}").with(AssetsController::serveWebJars);
        router.GET().route("/assets/{fileName: .*}").with(AssetsController::serveStatic);

        router.GET().route("/.*").with(ApplicationController::index);
    }

}
