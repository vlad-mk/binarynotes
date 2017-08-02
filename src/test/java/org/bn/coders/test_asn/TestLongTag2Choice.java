
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1Integer;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1Sequence;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;




    @ASN1PreparedElement
    @ASN1Sequence ( name = "TestLongTag2Choice", isSet = false )
    public class TestLongTag2Choice implements IASN1PreparedElement {
            @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "testb", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Long testb = null;
                
  
        
        public Long getTestb () {
            return this.testb;
        }

        

        public void setTestb (Long value) {
            this.testb = value;
        }
        
  
                    
        
        public void initWithDefaults() {
            
        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TestLongTag2Choice.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            