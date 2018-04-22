/**
 * CacheMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package org.apache.ws.axis2;


/**
 *  CacheMessageReceiverInOut message receiver
 */
public class CacheMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            CacheSkeleton skel = (CacheSkeleton) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("consultar".equals(methodName)) {
                    org.apache.ws.axis2.ConsultarResponse consultarResponse9 = null;
                    org.apache.ws.axis2.Consultar wrappedParam = (org.apache.ws.axis2.Consultar) fromOM(msgContext.getEnvelope()
                                                                                                                  .getBody()
                                                                                                                  .getFirstElement(),
                            org.apache.ws.axis2.Consultar.class);

                    consultarResponse9 = skel.consultar(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            consultarResponse9, false,
                            new javax.xml.namespace.QName(
                                "http://ws.apache.org/axis2",
                                "ConsultarResponse"));
                } else
                 if ("guardar".equals(methodName)) {
                    org.apache.ws.axis2.GuardarResponse guardarResponse11 = null;
                    org.apache.ws.axis2.Guardar wrappedParam = (org.apache.ws.axis2.Guardar) fromOM(msgContext.getEnvelope()
                                                                                                              .getBody()
                                                                                                              .getFirstElement(),
                            org.apache.ws.axis2.Guardar.class);

                    guardarResponse11 = skel.guardar(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            guardarResponse11, false,
                            new javax.xml.namespace.QName(
                                "http://ws.apache.org/axis2", "GuardarResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        org.apache.ws.axis2.Consultar param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.apache.ws.axis2.Consultar.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.apache.ws.axis2.ConsultarResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.apache.ws.axis2.ConsultarResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.apache.ws.axis2.Guardar param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.apache.ws.axis2.Guardar.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.apache.ws.axis2.GuardarResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.apache.ws.axis2.GuardarResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.apache.ws.axis2.ConsultarResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.apache.ws.axis2.ConsultarResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.ws.axis2.ConsultarResponse wrapConsultar() {
        org.apache.ws.axis2.ConsultarResponse wrappedElement = new org.apache.ws.axis2.ConsultarResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.apache.ws.axis2.GuardarResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.apache.ws.axis2.GuardarResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.ws.axis2.GuardarResponse wrapGuardar() {
        org.apache.ws.axis2.GuardarResponse wrappedElement = new org.apache.ws.axis2.GuardarResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (org.apache.ws.axis2.Consultar.class.equals(type)) {
                return org.apache.ws.axis2.Consultar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.apache.ws.axis2.ConsultarResponse.class.equals(type)) {
                return org.apache.ws.axis2.ConsultarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.apache.ws.axis2.Guardar.class.equals(type)) {
                return org.apache.ws.axis2.Guardar.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.apache.ws.axis2.GuardarResponse.class.equals(type)) {
                return org.apache.ws.axis2.GuardarResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
