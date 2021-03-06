/*******************************************************************************
* * Copyright 2018 Impetus Infotech.
* *
* * Licensed under the Apache License, Version 2.0 (the "License");
* * you may not use this file except in compliance with the License.
* * You may obtain a copy of the License at
* *
* * http://www.apache.org/licenses/LICENSE-2.0
* *
* * Unless required by applicable law or agreed to in writing, software
* * distributed under the License is distributed on an "AS IS" BASIS,
* * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* * See the License for the specific language governing permissions and
* * limitations under the License.
******************************************************************************/
package com.impetus.blkch.util;

public class TestQueryObject {

    private long column1;
    
    private long column2;
    
    private String qcol1;
    
    private String qcol2;
    
    private String filterField;
    
    public TestQueryObject(long column1, long column2, String qcol1, String qcol2, String filterField) {
        this.column1 = column1;
        this.column2 = column2;
        this.qcol1 = qcol1;
        this.qcol2 = qcol2;
        this.filterField = filterField;
    }

    public long getColumn1() {
        return column1;
    }

    public void setColumn1(long column1) {
        this.column1 = column1;
    }

    public long getColumn2() {
        return column2;
    }

    public void setColumn2(long column2) {
        this.column2 = column2;
    }

    public String getQcol1() {
        return qcol1;
    }

    public void setQcol1(String qcol1) {
        this.qcol1 = qcol1;
    }

    public String getQcol2() {
        return qcol2;
    }

    public void setQcol2(String qcol2) {
        this.qcol2 = qcol2;
    }

    public String getFilterField() {
        return filterField;
    }

    public void setFilterField(String filterField) {
        this.filterField = filterField;
    }
    
}
