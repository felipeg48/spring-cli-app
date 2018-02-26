@RestController
class Web {


   @Value('${app.version:SNAPSHOT}')
   String version

   @GetMapping('/')
   String index(){
      "This app is version: ${version}"
   }
}
