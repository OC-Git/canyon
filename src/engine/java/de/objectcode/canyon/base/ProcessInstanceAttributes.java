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

package de.objectcode.canyon.base;


/**
 * Describes the process instance system attributes supported by OBE.  Note that
 * process instances can also possess custom attributes, defined in the process
 * definition.  The string constants in this interface can be passed to
 * {@link org.wfmc.wapi.WAPI#getProcessInstanceAttributeValue} and as the
 * <code>attributeName</code> argument to
 * {@link WMFilter#WMFilter(String,int,Boolean)}.
 *
 * @author Adrian Price
 */
public interface ProcessInstanceAttributes {
    /**
     * The date/time at which the process instance was completed.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>java.util.Date</code></td><td>ReadOnly</td></tr>
     * </table>
     */
    String COMPLETED_DATE = "completedDate";

    /**
     * The date/time at which the process instance was created.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>java.util.Date</code></td><td>ReadOnly</td></tr>
     * </table>
     */
    String CREATED_DATE = "createdDate";

    /**
     * The date/time by which the process instance is expected to be complete.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>java.util.Date</code></td><td>ReadOnly</td></tr>
     * </table>
     */
    String DUE_DATE = "dueDate";

    /**
     * The name of the process instance.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>java.lang.String</code></td><td>Read/Write</td></tr>
     * </table>
     */
    String NAME = "name";

    /**
     * The process instance participant IDs.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>java.lang.String[]</code></td><td>ReadOnly</td></tr>
     * </table>
     */
    String PARTICIPANTS = "participants";

    /**
     * The process instance priority.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>int</code></td><td>Read/Write</td></tr>
     * </table>
     */
    String PRIORITY = "priority";

    /**
     * The ID of the process definition of which this is an instance.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>java.lang.String</code></td><td>ReadOnly</td></tr>
     * </table>
     */
    String PROCESS_DEFINITION_ID = "processDefinitionId";

    /**
     * The unique ID of the process instance.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>java.lang.String</code></td><td>ReadOnly</td></tr>
     * </table>
     */
    String PROCESS_INSTANCE_ID = "processInstanceId";

    /**
     * The date/time at which the process instance was started.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>java.util.Date</code></td><td>ReadOnly</td></tr>
     * </table>
     */
    String STARTED_DATE = "startedDate";

    /**
     * The state of the process instance.
     *
     * <table border="1">
     *  <tr><th>Data Type</th><th>Access</th></tr>
     *  <tr><td><code>int</code></td><td>ReadOnly</td></tr>
     * </table>
     * @see WMProcessInstanceState
     */
    String STATE = "state";
}