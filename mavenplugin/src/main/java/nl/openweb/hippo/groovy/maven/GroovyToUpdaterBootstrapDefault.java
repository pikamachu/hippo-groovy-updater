/*
 * Copyright 2017 Open Web IT B.V. (https://www.openweb.nl/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.openweb.hippo.groovy.maven;

import org.apache.maven.plugins.annotations.Mojo;

import nl.openweb.hippo.groovy.maven.processor.ScriptProcessor;
import nl.openweb.hippo.groovy.maven.processor.ScriptProcessorXML;

@Deprecated
@Mojo(name = "generate")
public class GroovyToUpdaterBootstrapDefault extends GroovyToUpdaterBootstrap{
    @Override
    protected ScriptProcessor getProcessorBase(){
        getLog().warn("The goal \"generate\" is deprecated, move to \"generate-xml\" or \"generate-yaml\"");
        return new ScriptProcessorXML();
    }
}
