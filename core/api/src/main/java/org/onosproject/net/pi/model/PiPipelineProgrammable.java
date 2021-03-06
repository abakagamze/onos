/*
 * Copyright 2017-present Open Networking Laboratory
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

package org.onosproject.net.pi.model;

import org.onosproject.net.driver.HandlerBehaviour;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * Behavior to program the pipeline of a device.
 */
public interface PiPipelineProgrammable extends HandlerBehaviour {
    /**
     * Deploys the given pipeconf to the device.
     *
     * @param pipeconf pipeconf
     * @return true if the operation was successful, false otherwise
     */
    // TODO: return an explanation of why things went wrong, and the status of the device.
    CompletableFuture<Boolean> deployPipeconf(PiPipeconf pipeconf);

    /**
     * Returns the default pipeconf for ths device, to be used when any other pipeconf is not available.
     *
     * @return optional pipeconf
     */
    Optional<PiPipeconf> getDefaultPipeconf();
}
