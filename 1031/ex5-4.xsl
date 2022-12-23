<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
    <HTML>
    <HEAD>
	<TITLE>simple xslt example</TITLE>
    </HEAD>
    <BODY>
	<xsl:apply-templates select = "/simple/name"/>
    </BODY>
    </HTML>
</xsl:template>

<xsl:template match ="/">
<p><xsl:value-of select="."/></p>
</xsl:template>
</xsl:stylesheet>