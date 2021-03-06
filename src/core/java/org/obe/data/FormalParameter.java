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

package org.obe.data;

import java.io.Serializable;

/** FormalParameter defines input and output parameters which are passed
 to tools.

 @author Anthony Eden
 */

public class FormalParameter implements Serializable {
    static final long serialVersionUID = 3019502908080770457L;

    private String id;
    private String name;
    private String description;
    private int index;
    private DataType dataType;
    private ParameterMode mode = ParameterMode.IN;

    /** Construct a new FormalParameter object.

     @param id The unique id
     @param name The name
     @param index The index of the parameter
     @param mode The ParameterMode
     @param dataType The DataType
     */

    public FormalParameter(String id, String name, String index, String mode, DataType dataType) {
        this(id, name, index != null ? Integer.parseInt(index) : 0, ParameterMode.fromString(mode), dataType);
    }

    /** Construct a new FormalParameter object.

     @param id The unique id
     @param name The name
     @param index The index of the parameter
     @param mode The ParameterMode
     @param dataType The DataType
     */

    public FormalParameter(String id, String name, int index, ParameterMode mode, DataType dataType) {
        this.id = id;
        this.name = name;

        setIndex(index);
        setMode(mode);
        setDataType(dataType);
    }

    /** Get the unique id.

     @return The id
     */

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setIndex(String index) {
        if (index != null) {
            setIndex(Integer.parseInt(index));
        }
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        if (dataType == null) {
            throw new IllegalArgumentException("Data type required");
        }
        this.dataType = dataType;
    }

    /** Get the parameter mode.  The default parameter mode of
     <code>ParameterMode.IN</code>.

     @return The parameter mode
     */

    public ParameterMode getMode() {
        return mode;
    }

    /** Set the parameter mode.  If a null value is passed then the parameter
     mode will be reset to the default (ParameterMode.IN).

     @param mode The new parameter mode
     */

    public void setMode(ParameterMode mode) {
        if (mode == null) {
            this.mode = ParameterMode.IN;
        } else {
            this.mode = mode;
        }
    }
}