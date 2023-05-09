package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class; testNG'deki .xml file'larda belirttiğimiz class'ları, packageları veya methodları nasıl
çalıştırıyorsak, Cucumber framework'unde de Runner class'ındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz
 */

//Cucumber ile JUnit'in entegre olmasını sağlayan test çalıştırıcı notasyonudur
@RunWith(Cucumber.class)
//Seneryoların nerede ve nasıl çalışacağı, hangi raporu kullancağıyla alakalı seçenekleri ayarlarız
@CucumberOptions(features = "src/test/resources/features/day30_ilkFeature",
        glue = {"techproed/stepDefinitions"},//Bu parametre ile kodlarımızı yazdığımız stepDefinition
        //class'ının packege'ını belirtiriz
        tags = "@gr1 or @sql")
/*
features ===> features'ların olduğu package'ın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu package'ın yolunu ver(Source Root)
tags ====> çalıştırmak istediğin grubu yaz
 */

public class Runner {
}