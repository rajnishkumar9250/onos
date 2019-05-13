/*
 * Copyright 2016-present Open Networking Foundation
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
package org.onosproject.pce.util;

import java.util.Set;

import org.onosproject.net.ConnectPoint;
import org.onosproject.net.DeviceId;
import org.onosproject.net.Link;
import org.onosproject.net.link.LinkListener;
import org.onosproject.net.link.LinkService;
import org.onosproject.net.Link.State;

import com.google.common.collect.FluentIterable;

/**
 * Test adapter for link service.
 */
public class LinkServiceAdapter implements LinkService {
    @Override
    public int getLinkCount() {
        return 0;
    }

    @Override
    public Iterable<Link> getLinks() {
        return null;
    }

    @Override
    public Iterable<Link> getActiveLinks() {
        return FluentIterable.from(getLinks())
                .filter(input -> input.state() == State.ACTIVE);
    }

    @Override
    public Set<Link> getDeviceLinks(DeviceId deviceId) {
        return null;
    }

    @Override
    public Set<Link> getDeviceEgressLinks(DeviceId deviceId) {
        return null;
    }

    @Override
    public Set<Link> getDeviceIngressLinks(DeviceId deviceId) {
        return null;
    }

    @Override
    public Set<Link> getLinks(ConnectPoint connectPoint) {
        return null;
    }

    @Override
    public Set<Link> getEgressLinks(ConnectPoint connectPoint) {
        return null;
    }

    @Override
    public Set<Link> getIngressLinks(ConnectPoint connectPoint) {
        return null;
    }

    @Override
    public Link getLink(ConnectPoint src, ConnectPoint dst) {
        return null;
    }

    @Override
    public void addListener(LinkListener listener) {
    }

    @Override
    public void removeListener(LinkListener listener) {
    }
}
