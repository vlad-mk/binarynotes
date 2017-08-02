
package org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.CoderFactory;
import org.bn.annotations.ASN1BoxedType;
import org.bn.annotations.ASN1Element;
import org.bn.annotations.ASN1PreparedElement;
import org.bn.annotations.ASN1SequenceOf;
import org.bn.coders.IASN1PreparedElement;
import org.bn.coders.IASN1PreparedElementData;
import org.bn.coders.TagClass;




    @ASN1PreparedElement
    @ASN1BoxedType ( name = "LstVersion" )
    public class LstVersion implements IASN1PreparedElement {
                
        
@ASN1SequenceOf( name = "LstVersion", isSetOf = true ) 

    
        @ASN1Element ( name = "LstVersion", isOptional =  false , hasTag =  true, tag = 75, 
        tagClass =  TagClass.Application  , hasDefaultValue =  false  )
    
        private java.util.Collection<Version>   value;        

        
        
        public LstVersion () {
        }
        
        
        
        public void setValue(java.util.Collection<Version>  value) {
            this.value = value;
        }
        
        
        
        public java.util.Collection<Version>  getValue() {
            return this.value;
        }            
        

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(LstVersion.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }

            
    }
            