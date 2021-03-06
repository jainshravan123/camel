/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.swf;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SWFComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.aws.swf.SWFConfiguration getOrCreateConfiguration(SWFComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws.swf.SWFConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SWFComponent target = (SWFComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "activitylist":
        case "activityList": getOrCreateConfiguration(target).setActivityList(property(camelContext, java.lang.String.class, value)); return true;
        case "activityschedulingoptions":
        case "activitySchedulingOptions": getOrCreateConfiguration(target).setActivitySchedulingOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions.class, value)); return true;
        case "activitythreadpoolsize":
        case "activityThreadPoolSize": getOrCreateConfiguration(target).setActivityThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "activitytypeexecutionoptions":
        case "activityTypeExecutionOptions": getOrCreateConfiguration(target).setActivityTypeExecutionOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions.class, value)); return true;
        case "activitytyperegistrationoptions":
        case "activityTypeRegistrationOptions": getOrCreateConfiguration(target).setActivityTypeRegistrationOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions.class, value)); return true;
        case "amazonswclient":
        case "amazonSWClient": getOrCreateConfiguration(target).setAmazonSWClient(property(camelContext, com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "childpolicy":
        case "childPolicy": getOrCreateConfiguration(target).setChildPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "clientconfigurationparameters":
        case "clientConfigurationParameters": getOrCreateConfiguration(target).setClientConfigurationParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws.swf.SWFConfiguration.class, value)); return true;
        case "dataconverter":
        case "dataConverter": getOrCreateConfiguration(target).setDataConverter(property(camelContext, com.amazonaws.services.simpleworkflow.flow.DataConverter.class, value)); return true;
        case "domainname":
        case "domainName": getOrCreateConfiguration(target).setDomainName(property(camelContext, java.lang.String.class, value)); return true;
        case "eventname":
        case "eventName": getOrCreateConfiguration(target).setEventName(property(camelContext, java.lang.String.class, value)); return true;
        case "executionstarttoclosetimeout":
        case "executionStartToCloseTimeout": getOrCreateConfiguration(target).setExecutionStartToCloseTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "swclientparameters":
        case "sWClientParameters": getOrCreateConfiguration(target).setSWClientParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "signalname":
        case "signalName": getOrCreateConfiguration(target).setSignalName(property(camelContext, java.lang.String.class, value)); return true;
        case "startworkflowoptionsparameters":
        case "startWorkflowOptionsParameters": getOrCreateConfiguration(target).setStartWorkflowOptionsParameters(property(camelContext, java.util.Map.class, value)); return true;
        case "stateresulttype":
        case "stateResultType": getOrCreateConfiguration(target).setStateResultType(property(camelContext, java.lang.String.class, value)); return true;
        case "taskstarttoclosetimeout":
        case "taskStartToCloseTimeout": getOrCreateConfiguration(target).setTaskStartToCloseTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "terminationdetails":
        case "terminationDetails": getOrCreateConfiguration(target).setTerminationDetails(property(camelContext, java.lang.String.class, value)); return true;
        case "terminationreason":
        case "terminationReason": getOrCreateConfiguration(target).setTerminationReason(property(camelContext, java.lang.String.class, value)); return true;
        case "version": getOrCreateConfiguration(target).setVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "workflowlist":
        case "workflowList": getOrCreateConfiguration(target).setWorkflowList(property(camelContext, java.lang.String.class, value)); return true;
        case "workflowtyperegistrationoptions":
        case "workflowTypeRegistrationOptions": getOrCreateConfiguration(target).setWorkflowTypeRegistrationOptions(property(camelContext, com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "activitylist":
        case "activityList": return java.lang.String.class;
        case "activityschedulingoptions":
        case "activitySchedulingOptions": return com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions.class;
        case "activitythreadpoolsize":
        case "activityThreadPoolSize": return int.class;
        case "activitytypeexecutionoptions":
        case "activityTypeExecutionOptions": return com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeExecutionOptions.class;
        case "activitytyperegistrationoptions":
        case "activityTypeRegistrationOptions": return com.amazonaws.services.simpleworkflow.flow.worker.ActivityTypeRegistrationOptions.class;
        case "amazonswclient":
        case "amazonSWClient": return com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "childpolicy":
        case "childPolicy": return java.lang.String.class;
        case "clientconfigurationparameters":
        case "clientConfigurationParameters": return java.util.Map.class;
        case "configuration": return org.apache.camel.component.aws.swf.SWFConfiguration.class;
        case "dataconverter":
        case "dataConverter": return com.amazonaws.services.simpleworkflow.flow.DataConverter.class;
        case "domainname":
        case "domainName": return java.lang.String.class;
        case "eventname":
        case "eventName": return java.lang.String.class;
        case "executionstarttoclosetimeout":
        case "executionStartToCloseTimeout": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return java.lang.String.class;
        case "region": return java.lang.String.class;
        case "swclientparameters":
        case "sWClientParameters": return java.util.Map.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "signalname":
        case "signalName": return java.lang.String.class;
        case "startworkflowoptionsparameters":
        case "startWorkflowOptionsParameters": return java.util.Map.class;
        case "stateresulttype":
        case "stateResultType": return java.lang.String.class;
        case "taskstarttoclosetimeout":
        case "taskStartToCloseTimeout": return java.lang.String.class;
        case "terminationdetails":
        case "terminationDetails": return java.lang.String.class;
        case "terminationreason":
        case "terminationReason": return java.lang.String.class;
        case "version": return java.lang.String.class;
        case "workflowlist":
        case "workflowList": return java.lang.String.class;
        case "workflowtyperegistrationoptions":
        case "workflowTypeRegistrationOptions": return com.amazonaws.services.simpleworkflow.flow.WorkflowTypeRegistrationOptions.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SWFComponent target = (SWFComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "activitylist":
        case "activityList": return getOrCreateConfiguration(target).getActivityList();
        case "activityschedulingoptions":
        case "activitySchedulingOptions": return getOrCreateConfiguration(target).getActivitySchedulingOptions();
        case "activitythreadpoolsize":
        case "activityThreadPoolSize": return getOrCreateConfiguration(target).getActivityThreadPoolSize();
        case "activitytypeexecutionoptions":
        case "activityTypeExecutionOptions": return getOrCreateConfiguration(target).getActivityTypeExecutionOptions();
        case "activitytyperegistrationoptions":
        case "activityTypeRegistrationOptions": return getOrCreateConfiguration(target).getActivityTypeRegistrationOptions();
        case "amazonswclient":
        case "amazonSWClient": return getOrCreateConfiguration(target).getAmazonSWClient();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "childpolicy":
        case "childPolicy": return getOrCreateConfiguration(target).getChildPolicy();
        case "clientconfigurationparameters":
        case "clientConfigurationParameters": return getOrCreateConfiguration(target).getClientConfigurationParameters();
        case "configuration": return target.getConfiguration();
        case "dataconverter":
        case "dataConverter": return getOrCreateConfiguration(target).getDataConverter();
        case "domainname":
        case "domainName": return getOrCreateConfiguration(target).getDomainName();
        case "eventname":
        case "eventName": return getOrCreateConfiguration(target).getEventName();
        case "executionstarttoclosetimeout":
        case "executionStartToCloseTimeout": return getOrCreateConfiguration(target).getExecutionStartToCloseTimeout();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return getOrCreateConfiguration(target).getOperation();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "swclientparameters":
        case "sWClientParameters": return getOrCreateConfiguration(target).getSWClientParameters();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "signalname":
        case "signalName": return getOrCreateConfiguration(target).getSignalName();
        case "startworkflowoptionsparameters":
        case "startWorkflowOptionsParameters": return getOrCreateConfiguration(target).getStartWorkflowOptionsParameters();
        case "stateresulttype":
        case "stateResultType": return getOrCreateConfiguration(target).getStateResultType();
        case "taskstarttoclosetimeout":
        case "taskStartToCloseTimeout": return getOrCreateConfiguration(target).getTaskStartToCloseTimeout();
        case "terminationdetails":
        case "terminationDetails": return getOrCreateConfiguration(target).getTerminationDetails();
        case "terminationreason":
        case "terminationReason": return getOrCreateConfiguration(target).getTerminationReason();
        case "version": return getOrCreateConfiguration(target).getVersion();
        case "workflowlist":
        case "workflowList": return getOrCreateConfiguration(target).getWorkflowList();
        case "workflowtyperegistrationoptions":
        case "workflowTypeRegistrationOptions": return getOrCreateConfiguration(target).getWorkflowTypeRegistrationOptions();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "clientconfigurationparameters":
        case "clientConfigurationParameters": return java.lang.Object.class;
        case "swclientparameters":
        case "sWClientParameters": return java.lang.Object.class;
        case "startworkflowoptionsparameters":
        case "startWorkflowOptionsParameters": return java.lang.Object.class;
        default: return null;
        }
    }
}

