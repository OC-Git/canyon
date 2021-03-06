/*-- 

 Copyright (C) 2002-2003 Aetrion LLC.
 All rights reserved.
 
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions, and the following disclaimer.
 
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions, and the disclaimer that follows 
    these conditions in the documentation and/or other materials 
    provided with the distribution.

 3. The names "OBE" and "Open Business Engine" must not be used to 
 	endorse or promote products derived from this software without prior 
 	written permission.  For written permission, please contact 
 	obe@aetrion.com.
 
 4. Products derived from this software may not be called "OBE" or
 	"Open Business Engine", nor may "OBE" or "Open Business Engine" 
 	appear in their name, without prior written permission from 
 	Aetrion LLC (obe@aetrion.com).

 THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR(S) BE LIABLE FOR ANY DIRECT, 
 INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES 
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR 
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) 
 HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, 
 STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING 
 IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 POSSIBILITY OF SUCH DAMAGE.

 For more information on OBE, please see 
 <http://www.openbusinessengine.org/>.
 
 */

package de.objectcode.canyon.spiImpl.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import de.objectcode.canyon.model.process.DataField;
import de.objectcode.canyon.spi.event.ApplicationEvent;
import de.objectcode.canyon.spi.event.AttributeInstanceEvent;
import de.objectcode.canyon.spi.event.IAttributeInstanceListener;
import de.objectcode.canyon.spi.event.IWorkflowEventBroker;
import de.objectcode.canyon.spi.instance.IAttributeInstance;

/**
 * Supports attribute instance listeners.  This class maintains a list of
 * {@link org.obe.spi.event.AttributeInstanceListener}s, and provides a set of
 * <code>fireAttributeInstance&lt;Event&gt;({@link org.obe.spi.model.AttributeInstance} source,
 * {@link DataField} definition)</code> methods to notify the listeners of
 * events.
 *
 * @author Adrian Price
 */
public final class AttributeInstanceListenerSupport
    extends AbstractListenerSupport {

    private static final Log _logger = LogFactory.getLog(
        AttributeInstanceListenerSupport.class);
    private static final String[] NOTIFICATION_METHODS = {
        "attributeInstanceCreated",
        "attributeInstanceDeleted",
        "attributeInstanceUpdated"
    };

    public AttributeInstanceListenerSupport(IWorkflowEventBroker eventBroker) {
        super(eventBroker, AttributeInstanceEvent.class,
            IAttributeInstanceListener.class, NOTIFICATION_METHODS);
    }

    public void fireAttributeInstanceCreated(IAttributeInstance source,
        DataField definition) {

        fireEvent(createAttributeInstanceCreated(source, definition));
    }

    public ApplicationEvent createAttributeInstanceCreated(IAttributeInstance source,
        DataField definition) {

        return createEvent(source, AttributeInstanceEvent.CREATED, definition);
    }

    public void fireAttributeInstanceDeleted(IAttributeInstance source,
        DataField definition) {

        fireEvent(createAttributeInstanceDeleted(source, definition));
    }

    public ApplicationEvent createAttributeInstanceDeleted(IAttributeInstance source,
        DataField definition) {

        return createEvent(source, AttributeInstanceEvent.DELETED, definition);
    }

    public void fireAttributeInstanceUpdated(IAttributeInstance source,
        DataField definition) {

        fireEvent(createAttributeInstanceUpdated(source, definition));
    }

    public ApplicationEvent createAttributeInstanceUpdated(IAttributeInstance source,
        DataField definition) {

        return createEvent(source, AttributeInstanceEvent.UPDATED, definition);
    }

    public Log getLogger() {
        return _logger;
    }
}