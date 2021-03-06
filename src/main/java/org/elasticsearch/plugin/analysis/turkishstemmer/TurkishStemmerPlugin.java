package org.elasticsearch.plugin.analysis.turkishstemmer;

import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.index.analysis.TurkishStemmerBinderProcessor;
import org.elasticsearch.plugins.AbstractPlugin;

public class TurkishStemmerPlugin extends AbstractPlugin {

  @Override
  public String description() {
    return "Turkish stemmer";
  }

  @Override
  public String name() {
    return "turkish-stemmer";
  }

  public void onModule(AnalysisModule module) {
    module.addProcessor(new TurkishStemmerBinderProcessor());
  }
}
