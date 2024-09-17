[ERROR] Failed to execute goal org.wildfly.plugins:wildfly-maven-plugin:2.1.0.Final:deploy (default-cli) on project demo2023-ejb: Failed to execute goal deploy: {"WFLYCTL0062: Composite operation failed and was rolled back. Steps that failed:" => {"Operation step-1" => {"WFLYCTL0080: Failed services" => {"jboss.module.service.\"deployment.demo2023-ejb.jar\".main" => "WFLYSRV0179: Failed to load module: deployment.demo2023-ejb.jar
[ERROR]     Caused by: org.jboss.modules.ModuleNotFoundException: org.hibernate:5.3"}}}}
[ERROR] -> [Help 1]
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.wildfly.plugins:wildfly-maven-plugin:2.1.0.Final:deploy (default-cli) on project demo2023-ejb: Failed to execute goal deploy: {"WFLYCTL0062: Composite operation failed and was rolled back. Steps that failed:" => {"Operation step-1" => {"WFLYCTL0080: Failed services" => {"jboss.module.service.\"deployment.demo2023-ejb.jar\".main" => "WFLYSRV0179: Failed to load module: deployment.demo2023-ejb.jar
    Caused by: org.jboss.modules.ModuleNotFoundException: org.hibernate:5.3"}}}}


    no lo pude deployar por este error pero lo seguire viendo.