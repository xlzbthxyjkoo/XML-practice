<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
	<people>
		<xsl:apply-templates select="/people/name"/>
	</people>
</xsl:template>

<xsl:template match="name">
	<name>
		<xsl:apply-templates select="@*"/>
	</name>
</xsl:template>

<xsl:template match="@*">
	<xsl:element name="{local-name()}"><xsl:value-of select="."/>
</xsl:template>
</xsl:stylesheet>