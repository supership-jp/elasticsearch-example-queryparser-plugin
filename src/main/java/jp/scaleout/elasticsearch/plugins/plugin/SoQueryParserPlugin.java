package jp.scaleout.elasticsearch.plugins.plugin;

import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.indices.IndicesModule;
import jp.scaleout.elasticsearch.plugins.queryparser.SoQueryParser;

public class SoQueryParserPlugin extends Plugin {
    public String name() {  
        return "scaleout query parser";  
    }  

    public String description() {
        return "scaleout query parser plugin";
    }
    
    public void onModule(IndicesModule module){
        module.registerQueryParser(SoQueryParser.class);
    }
    
}
