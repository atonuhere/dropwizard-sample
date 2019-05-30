package com.evilcorp.sampleapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

public class SampleAppConfiguration extends Configuration {
    @NotEmpty
    private String applicationName;
    @NotEmpty
    private String version;
 
    private DataSourceFactory database = new DataSourceFactory();
    
    @JsonProperty
    public String getVersion() {
        return version;
    }
 
    @JsonProperty
    public void setVersion(String version) {
        this.version = version;
    }
    
    @JsonProperty
    public String getApplicationName() {
        return applicationName;
    }

    @JsonProperty
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory factory) {
        this.database = factory;
    }

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
}
